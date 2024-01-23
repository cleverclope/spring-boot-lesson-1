package com.roles.rolesDTOnormalizationlesson.permission;

import com.roles.rolesDTOnormalizationlesson.response.ResponseDTO;
import com.roles.rolesDTOnormalizationlesson.response.SharedResponseService;

import java.util.List;

public interface PermissionService extends SharedResponseService<PermissionsDTO> {
    ResponseDTO<String> create(CreatePermissionDTO dto);
    Permission dbSave(Permission role);
    List<Permission> dbFindAll();
    Permission dbFindById(long permissionId);
    ResponseDTO<String> edit(long permissionId , CreatePermissionDTO dto);
    ResponseDTO<String> delete(long permissionId);
}
