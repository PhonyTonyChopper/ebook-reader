// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    val kotlinVersion = "2.0.20"

    id("com.android.application") version "8.6.1" apply false
    id("org.jetbrains.kotlin.android") version kotlinVersion apply false
    id("org.jetbrains.kotlin.plugin.serialization") version kotlinVersion apply false
}
