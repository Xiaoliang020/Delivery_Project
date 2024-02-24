package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {
    /**
     * Save a new setmeal
     * @param setmealDTO
     */
    void save(SetmealDTO setmealDTO);

    /**
     * Page query for setmeal
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult page(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * Delete setmeals with given ids
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * Get setmeal with dishes by id
     * @param id
     * @return
     */
    SetmealVO getByIdWithDish(Long id);

    /**
     * Update the setmeal
     * @param setmealDTO
     */
    void update(SetmealDTO setmealDTO);

    /**
     * Change status of setmeal
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */
    List<DishItemVO> getDishItemById(Long id);
}
