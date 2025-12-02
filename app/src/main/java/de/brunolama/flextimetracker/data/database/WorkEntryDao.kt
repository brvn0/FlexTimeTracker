package de.brunolama.flextimetracker.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import de.brunolama.flextimetracker.data.model.WorkEntry
import kotlinx.coroutines.flow.Flow
import java.time.LocalDateTime

@Dao
interface WorkEntryDao {
    @Insert
    suspend fun insert(workEntry: WorkEntry)

    @Update
    suspend fun update(workEntry: WorkEntry)

    @Query("SELECT * FROM work_entries ORDER BY checkIn DESC")
    fun getAll(): Flow<List<WorkEntry>>

    @Query("SELECT * FROM work_entries WHERE checkIn >= :start AND checkIn <= :end ORDER BY checkIn DESC")
    fun getEntriesForDateRange(start: LocalDateTime, end: LocalDateTime): Flow<List<WorkEntry>>
}