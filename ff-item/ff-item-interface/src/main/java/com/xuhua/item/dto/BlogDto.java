package com.xuhua.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 14:13 2019/5/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDto {
    private List<Long> tagIds;
}
