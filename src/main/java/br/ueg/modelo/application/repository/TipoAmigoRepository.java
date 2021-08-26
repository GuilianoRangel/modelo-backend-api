package br.ueg.modelo.application.repository;

import br.ueg.modelo.application.enums.StatusAtivoInativo;
import br.ueg.modelo.application.model.Grupo;
import br.ueg.modelo.application.model.TipoAmigo;
import br.ueg.modelo.application.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Classe de persistência referente a entidade {@link Usuario}.
 *
 * @author UEG
 */
@Repository
public interface TipoAmigoRepository extends JpaRepository<TipoAmigo, Long>, TipoAmigoRepositoryCustom{

    /**
     * Retorna o total de TipoAmigo com o mesmo nome.
     * @param nome
     * @return
     */
    public Long countByNome(String nome);

}
