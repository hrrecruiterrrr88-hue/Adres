package com.anjes.taskmanager.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Int, // 0: Low, 1: Medium, 2: High
    val deadline: Long,
    val status: String = "NEW", // NEW, PROGRESS, DONE
    val category: String = "General"
)
