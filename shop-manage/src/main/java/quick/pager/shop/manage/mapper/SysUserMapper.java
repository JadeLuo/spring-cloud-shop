package quick.pager.shop.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import quick.pager.shop.manage.model.SysUser;

/**
 * 系统用户Mapper
 *
 * @author siguiyang
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据用户名查询系统登陆用户
     *
     * @param phone 登陆手机号码
     * @return 系统用户
     */
    SysUser selectSysUserByUsername(@Param("phone") String phone);


    /**
     * 查询系统用户列表
     *
     * @param sysName 系统用户名
     * @return 查询系统用户列表
     */
    List<SysUser> selectSysUser(@Param("sysName") String sysName);

}
