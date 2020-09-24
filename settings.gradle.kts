
plugins {
    id("com.gradle.enterprise").version("3.4.1")
}

rootProject.name = "leetcode-challenges-kt"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}