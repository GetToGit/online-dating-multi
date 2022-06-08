package club.iseeu.controller;

import club.iseeu.core.Admin;
import club.iseeu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("adminList")
    public List<Admin> adminList() {
        return adminService.adminList();
    }
}
