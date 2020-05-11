package cn.kgc.commonbase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 吴雨森
 * @data 2020/5/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoicingSystemException extends RuntimeException{

    private String message;
}
