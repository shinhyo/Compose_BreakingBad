/*
 * Copyright 2021 shinhyo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.shinhyo.brba.core.model

import java.util.Date

data class BrbaCharacter(
    val charId: Long,
    val name: String = "",
    val birthday: String = "",
    val img: String = "",
    val status: String = "",
    val nickname: String = "",
    val portrayed: String = "",
    val category: List<String> = listOf(),
    val description: String = "",
    val ratio: Float = 1f,
    val isFavorite: Boolean = false,
    val ctime: Date = Date(),
)