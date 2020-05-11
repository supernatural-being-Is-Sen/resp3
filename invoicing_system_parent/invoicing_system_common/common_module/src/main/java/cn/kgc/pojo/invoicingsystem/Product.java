package cn.kgc.pojo.invoicingsystem;

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
@ApiModel(value="Product对象", description="")
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "库存量")
    private Integer quantity;

}
