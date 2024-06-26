package ru.edu.hse.assistant.presentation.viewmodels

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.launch
import ru.edu.hse.assistant.domain.usecases.GetResponseUseCase
import ru.edu.hse.common.ResultContainer
import ru.edu.hse.presentation.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class AssistantViewModel @Inject constructor(
    private val getResponseUseCase: GetResponseUseCase
) : BaseViewModel() {

    private val _response = MutableStateFlow<ResultContainer<String>>(ResultContainer.Done(""))
    val response = _response.asStateFlow()

    fun getResponse(message: String) = debounce {
        viewModelScope.launch {
            var isCompleted = false

            getResponseUseCase.getResponse(message)
                .takeWhile { !isCompleted }
                .collect {
                    _response.value = it
                    if (it !is ResultContainer.Loading) {
                        isCompleted = true
                        return@collect
                    }
                }
        }
    }
}