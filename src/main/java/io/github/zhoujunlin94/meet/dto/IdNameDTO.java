package io.github.zhoujunlin94.meet.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhoujunlin
 * @date 2025/5/29 22:12
 */
@Data
@Accessors(chain = true)
@Schema(description = "id name数据")
public class IdNameDTO {

    @Schema(description = "id")
    private Integer id;

    @Schema(description = "name")
    private String name;

}
