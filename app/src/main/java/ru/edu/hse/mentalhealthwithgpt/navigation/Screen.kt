package ru.edu.hse.mentalhealthwithgpt.navigation

enum class Screen(val route: String) {
    SignInScreen("sign_in_screen"),
    SignUpScreen("sign_up_screen"),
    HomeScreen("home_screen"),
    ProfileScreen("profile_screen"),
    AssistantScreen("assistant_screen"),
    PrivacyPolicyScreen("privacy_policy_screen"),
}