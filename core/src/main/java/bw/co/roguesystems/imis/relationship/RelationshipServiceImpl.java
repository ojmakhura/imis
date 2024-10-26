// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::relationship::RelationshipService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.relationship;

import bw.co.roguesystems.imis.ImisSpecifications;
import bw.co.roguesystems.imis.PropertySearchOrder;
import bw.co.roguesystems.imis.SortOrderFactory;

import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.relationship.RelationshipService
 */
@Service("relationshipService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class RelationshipServiceImpl
    extends RelationshipServiceBase
{
    public RelationshipServiceImpl(
        RelationshipDao relationshipDao,
        RelationshipRepository relationshipRepository,
        MessageSource messageSource
    ) {
        
        super(
            relationshipDao,
            relationshipRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#findById(Long)
     */
    @Override
    protected RelationshipVO handleFindById(Long id)
        throws Exception
    {

        return this.getRelationshipDao().toRelationshipVO(relationshipRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#getAll()
     */
    @Override
    protected Collection<RelationshipVO> handleGetAll()
        throws Exception
    {

        return this.getRelationshipDao().toRelationshipVOCollection(relationshipRepository.findAll());
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        relationshipRepository.deleteById(id);
        return true;
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#save(RelationshipVO)
     */
    @Override
    protected RelationshipVO handleSave(RelationshipVO relationship)
        throws Exception
    {

        Relationship rel = this.getRelationshipDao().relationshipVOToEntity(relationship);
        rel = relationshipRepository.save(rel);

        return this.getRelationshipDao().toRelationshipVO(rel);
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<RelationshipVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {

        Specification<Relationship> spec = ImisSpecifications.findByAttributeContainingIgnoreCase(criteria, "relation");
        Sort sort = SortOrderFactory.createSortOrder(orderings);

        if(sort == null) {
            return this.getRelationshipDao().toRelationshipVOCollection(relationshipRepository.findAll(spec));
        } else {
            return this.getRelationshipDao().toRelationshipVOCollection(relationshipRepository.findAll(spec, sort));
        }
    }

}