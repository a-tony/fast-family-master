package com.fast.family.redis.lock.strategy;

import com.fast.family.redis.lock.entity.LockInfo;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

/**
 * @author 张顺
 * @version 1.0
 */
@Slf4j
public class WriteLockStrategy implements LockStrategy {

    private RedissonClient redissonClient;

    public WriteLockStrategy(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }

    @Override
    public RLock tryLock(LockInfo lockInfo) throws InterruptedException {
        return null;
    }

    @Override
    public void unlock(RLock lock) {

    }

}
