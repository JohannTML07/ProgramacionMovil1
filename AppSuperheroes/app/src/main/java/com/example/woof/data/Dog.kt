/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.batman, R.string.super_name_1, 40, R.string.super_description_1),
    Dog(R.drawable.wanda, R.string.super_name_2, 30, R.string.super_description_2),
    Dog(R.drawable.ironman, R.string.super_name_3, 50, R.string.super_description_3),
    Dog(R.drawable.thor, R.string.super_name_4, 1000, R.string.super_description_4),
    Dog(R.drawable.deadpool, R.string.super_name_5, 35, R.string.super_description_5),
    Dog(R.drawable.spiderman, R.string.super_name_6, 19, R.string.super_description_6),
    Dog(R.drawable.superman, R.string.super_name_7, 26, R.string.super_description_7),
    Dog(R.drawable.capitanamerica, R.string.super_name_8, 31, R.string.super_description_8),
    Dog(R.drawable.flash, R.string.super_name_9, 24, R.string.super_description_9)
)
