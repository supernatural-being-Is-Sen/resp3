package cn.kgc.pojo.invoicingsystem.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 销售信息
 * @author 吴雨森
 * @data 2020/5/10
 */
@Data
@ApiModel(value = "SaleInfoVo对象",description = "销售信息")
public class SaleInfoVo implements Serializable {


    @ApiModelProperty(value = "销售信息编号")
    private String saleId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "单价")
    private BigDecimal price;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "销售日期")
    private LocalDate saleDate;

    @ApiModelProperty(value = "销售员")
    private String userName;
}
