package com.roles.rolesDTOnormalizationlesson.permission;

import com.roles.rolesDTOnormalizationlesson.response.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PermissionServiceImpl implements PermissionService{
    @Override
    public ResponseDTO<List<PermissionsDTO>> search(Map<String, ?> queryParams) {
        return null;
    }

    @Override
    public ResponseDTO<PermissionsDTO> searchOne(long id) {
        return null;
    }

    @Override
    public ResponseDTO<String> create(CreatePermissionDTO dto) {
        return null;
    }

    @Override
    public Permission dbSave(Permission role) {
        return null;
    }

    @Override
    public List<Permission> dbFindAll() {
        return null;
    }

    @Override
    public Permission dbFindById(long permissionId) {
        return null;
    }

    @Override
    public ResponseDTO<String> edit(long permissionId, CreatePermissionDTO dto) {
        return null;
    }

    @Override
    public ResponseDTO<String> delete(long permissionId) {
        return null;
    }
}
