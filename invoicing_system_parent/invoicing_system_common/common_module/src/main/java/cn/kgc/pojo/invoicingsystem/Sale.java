package cn.kgc.pojo.invoicingsystem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author 吴雨森
 * @since 2020-05-10
 */
@Data
@ApiModel(value="Sale对象", description="")
public class Sale implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    private String id;

    @ApiModelProperty(value = "销售单价")
    private BigDecimal price;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "销售日期")
    private LocalDate saleDate;

    @ApiModelProperty(value = "销售员编号")
    private String userId;

    @ApiModelProperty(value = "商品编号")
    private Long productId;

}
