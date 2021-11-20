package com.softwares.wherearethey.repositories

import com.softwares.wherearethey.db.Run
import com.softwares.wherearethey.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run:Run) = runDao.insertRun(run)
    suspend fun deleteRun(run:Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedBy("timestamp")

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedBy("distance")

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedBy("timemilli")

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedBy("speed")

    fun getAllRunsSortedByCaloriesBurnt() = runDao.getAllRunsSortedBy("distance")

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurnt() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}