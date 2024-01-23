package com.roles.rolesDTOnormalizationlesson.role;

import com.roles.rolesDTOnormalizationlesson.response.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Override
    public ResponseDTO<List<RolesDTO>> search(Map<String, ?> queryParams) {
        return null;
    }

    @Override
    public ResponseDTO<RolesDTO> searchOne(long id) {
        return null;
    }

    @Override
    public ResponseDTO<String> create(CreateRoleDTO dto) {
        return null;
    }

    @Override
    public Roles dbSave(Roles role) {
        return null;
    }

    @Override
    public List<Roles> dbFindAll() {
        return null;
    }

    @Override
    public Roles dbFindById(long roleId) {
        return null;
    }

    @Override
    public ResponseDTO<String> edit(long roleId, CreateRoleDTO dto) {
        return null;
    }

    @Override
    public ResponseDTO<String> delete(long roleId) {
        return null;
    }

}
