package top.hellocode.service.impl;

import top.hellocode.entity.User;
import top.hellocode.mapper.UserMapper;
import top.hellocode.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 百万数据用户表 服务实现类
 * </p>
 *
 * @author HelloCode.
 * @since 2023-08-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
