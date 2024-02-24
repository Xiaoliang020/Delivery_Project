package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    /**
     * Insert in batch
     * @param orderDetailList
     */
    void insertBatch(List<OrderDetail> orderDetailList);

    /**
     * Get order by id
     * @param orderId
     * @return
     */
    @Select("select * from sky_take_out.order_detail where order_id=#{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);
}
