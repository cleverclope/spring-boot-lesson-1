package com.roles.rolesDTOnormalizationlesson.role;

import com.roles.rolesDTOnormalizationlesson.response.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lesson/roles")
public class RolesController {

    private final RoleService roleService;

    @PostMapping
    public ResponseDTO<String> create(@RequestBody CreateRoleDTO dto){
        return roleService.create(dto);
    }

    @GetMapping("/{roleId}")
    public ResponseDTO<RolesDTO> searchOne(@PathVariable long roleId) {
        return roleService.searchOne(roleId);
    }

    @GetMapping
    public ResponseDTO<List<RolesDTO>> search(Map<String, ?> queryParams) {
        return roleService.search(queryParams);
    }

    @DeleteMapping("/{roleId}")
    public ResponseDTO<String> delete(@PathVariable("roleId") long roleId) {
        return roleService.delete(roleId);
    }
}
