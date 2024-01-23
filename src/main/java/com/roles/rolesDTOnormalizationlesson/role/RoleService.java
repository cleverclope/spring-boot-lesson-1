package com.roles.rolesDTOnormalizationlesson.role;

import com.roles.rolesDTOnormalizationlesson.response.ResponseDTO;
import com.roles.rolesDTOnormalizationlesson.response.SharedResponseService;

import java.util.List;

public interface RoleService extends SharedResponseService<RolesDTO> {
    ResponseDTO<String> create(CreateRoleDTO dto);
    Roles dbSave(Roles role);
    List<Roles> dbFindAll();
    Roles dbFindById(long roleId);
    ResponseDTO<String> edit(long roleId , CreateRoleDTO dto);
    ResponseDTO<String> delete(long roleId);

}
