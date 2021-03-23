package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author Gyt
 * @create 2021-03-21 - 22:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String name;
    private int Money;
    private Date createtime;
    private Date updatetime;

}
