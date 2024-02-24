package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * Get setmeal ids based on dish ids
     * @param dishIds
     * @return
     */
    // select setmeal id from setmeal_dish where dish_id in (1,2,3)
    List<Long> getSetmealIdsDishIds(List<Long> dishIds);

    /**
     * Insert a setmeal dish
     * @param setmealDish
     */
    void insert(SetmealDish setmealDish);

    /**
     * Insert setmeal dishes in batch
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * Delete by setmeal id
     * @param setmealId
     */
    @Delete("delete from sky_take_out.setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);

    /**
     * Get a list of dishes by setmeal id
     * @param id
     * @return
     */
    @Select("select * from sky_take_out.setmeal_dish where setmeal_id = #{id}")
    List<SetmealDish> getBySetmealId(Long id);
}
