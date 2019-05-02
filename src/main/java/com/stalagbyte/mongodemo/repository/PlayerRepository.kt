package com.stalagbyte.mongodemo.repository

import com.stalagbyte.mongodemo.model.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String>{
    fun findTop3ByOrderByTotalScoreDesc() : List<Player>
}