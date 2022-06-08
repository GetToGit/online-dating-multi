package club.iseeu.core;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("iseeu_admin")
@Data
public class Admin {
    /*
     * 主键属性 @TableId
     *
     * value 该属性 对应的数据库中的字段名
     * type 主键自增类型 AUTO 代表自动递增
     * */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /*
     * 非主键属性 @TableField
     *
     * @TableField("username") 对应的数据库中的字段名
     * */
    private String username;
    private String password;
    private String salt;
}
