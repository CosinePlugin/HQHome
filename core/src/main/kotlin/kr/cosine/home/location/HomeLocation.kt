package kr.cosine.home.location

import kr.hqservice.framework.netty.api.NettyChannel

interface HomeLocation {
    
    val channel: NettyChannel
    
    val world: String
    
    val x: Double
    
    val y: Double
    
    val z: Double
    
    val yaw: Float
    
    val pitch: Float
}