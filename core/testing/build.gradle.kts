plugins {
    id("brba.android.library")
}

android {
    namespace = "io.github.shinhyo.brba.core.testing"
}

dependencies {

    api(project(":core:data"))
    api(project(":core:domain"))
    api(project(":core:model"))
    api(libs.kotlinx.coroutines.test)
    api(libs.turbine)
    api(libs.mockk)
    api(libs.junit)
//    androidTestApi(libs.androidx.test.ext.junit)
//    androidTestApi(libs.androidx.test.espresso.core)
}
