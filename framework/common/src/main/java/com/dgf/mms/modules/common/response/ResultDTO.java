package com.dgf.mms.modules.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *     响应封装
 * </p>
 * @author dengganfeng
 * @since 2019-02-16 22:58:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO {
    private Integer responseType;
    private String message;
    private Object data;
}
