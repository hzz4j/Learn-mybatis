package org.hzz.mapper;

import org.hzz.pojo.Emp;

/**
 * @Author 静默
 * @Email 1193094618@qq.com
 */
public interface EmpMapper {
    Emp selectEmp(Integer id);

    Integer insertEmp(Emp emp);

    Integer updateEmp(Emp emp);

    Integer deleteEmp(Integer id);
}
