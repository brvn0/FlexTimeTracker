package de.brunolama.flextimetracker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "work_entries")
data class WorkEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val checkIn: LocalDateTime,
    val checkOut: LocalDateTime?
)