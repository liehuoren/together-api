package com.zhlzzz.together.user.user_relation;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRelationRepository extends Repository<UserRelationEntity, Long> {
    UserRelationEntity save(UserRelationEntity userRelationEntity);
    Optional<UserRelationEntity> findByUserIdAndToUserId(Long userId, Long toUserId);
    List<UserRelationEntity> findByUserIdAndRelation(Long userId, UserRelation.Relation relation);
}
