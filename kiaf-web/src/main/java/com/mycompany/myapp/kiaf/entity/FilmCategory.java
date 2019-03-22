package com.mycompany.myapp.kiaf.entity;

import com.kedacom.kidp.base.data.common.entity.BaseEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by keda on 2019/3/21.
 * 影片分类连接表
 */

@Entity
@Data
@Table(name = "film_category")
@EntityListeners(AuditingEntityListener.class)
public class FilmCategory extends BaseEntity{
    @Column(name = "film_id")
    private Long filmId;
    @Column(name = "category_id")
    private Long categoryId;
}
