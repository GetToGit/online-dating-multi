package club.iseeu.service;

import club.iseeu.core.Admin;
import club.iseeu.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 之所以能够直接使用 @service注解 是因为 service 模块 依赖了dao模块
 * core模块 中的 MybatiesPlus 依赖在项目中导入了spring jar包
 * */
@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public List<Admin> adminList() {
        return adminDao.selectList(null);
    }
}
