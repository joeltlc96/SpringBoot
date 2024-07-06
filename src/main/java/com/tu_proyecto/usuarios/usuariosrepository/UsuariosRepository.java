package com.tu_proyecto.usuarios.usuariosrepository;


import com.tu_proyecto.usuarios.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    @Procedure(name = "Usuarios.SP_GET_USUARIOS")
    List<Usuarios> findAllUsuarios();

    @Procedure(name = "Usuarios.SP_GET_USUARIO_BY_ID")
    Usuarios findUsuarioById(@Param("PI_ID_USUARIO") Integer id);

    @Procedure(name = "Usuarios.SP_INS_USUARIO")
    void saveUsuario(
            @Param("PV_CODIGO") String codigo,
            @Param("PV_NOMBRES") String nombres,
            @Param("PV_APELLIDOS") String apellidos,
            @Param("PV_MAIL") String mail,
            @Param("PD_FECHA_NACIMIENTO") Date fechaNacimiento,
            @Param("PV_CONTRASENA") String contrasena,
            @Param("PI_USUARIO_CREACION") Integer usuarioCreacion
    );

    @Procedure(name = "Usuarios.SP_UPD_USUARIO")
    void updateUsuario(
            @Param("PI_ID_USUARIO") Integer idUsuario,
            @Param("PV_CODIGO") String codigo,
            @Param("PV_NOMBRES") String nombres,
            @Param("PV_APELLIDOS") String apellidos,
            @Param("PV_MAIL") String mail,
            @Param("PD_FECHA_NACIMIENTO") Date fechaNacimiento,
            @Param("PV_CONTRASENA") String contrasena,
            @Param("PI_USUARIO_MODIFICACION") Integer usuarioModificacion
    );

    @Procedure(name = "Usuarios.SP_DEL_USUARIO")
    void deleteUsuario(
            @Param("PI_ID_USUARIO") Integer idUsuario,
            @Param("PI_USUARIO_MODIFICACION") Integer usuarioModificacion
    );
}