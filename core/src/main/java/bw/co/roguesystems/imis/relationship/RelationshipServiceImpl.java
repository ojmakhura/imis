// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::relationship::RelationshipService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.relationship;

import bw.co.roguesystems.imis.PropertySearchOrder;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
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
        // TODO implement protected  RelationshipVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.relationship.RelationshipService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#getAll()
     */
    @Override
    protected Collection<RelationshipVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<RelationshipVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.relationship.RelationshipService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.relationship.RelationshipService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#save(RelationshipVO)
     */
    @Override
    protected RelationshipVO handleSave(RelationshipVO relationship)
        throws Exception
    {
        // TODO implement protected  RelationshipVO handleSave(RelationshipVO relationship)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.relationship.RelationshipService.handleSave(RelationshipVO relationship) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.relationship.RelationshipService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<RelationshipVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<RelationshipVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.relationship.RelationshipService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

}