// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::policy::type::PolicyTypeService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.policy.type;

import bw.co.roguesystems.imis.PropertySearchOrder;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService
 */
@Service("policyTypeService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class PolicyTypeServiceImpl
    extends PolicyTypeServiceBase
{
    public PolicyTypeServiceImpl(
        PolicyTypeDao policyTypeDao,
        PolicyTypeRepository policyTypeRepository,
        MessageSource messageSource
    ) {
        
        super(
            policyTypeDao,
            policyTypeRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#findById(Long)
     */
    @Override
    protected PolicyTypeVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  PolicyTypeVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.PolicyTypeService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#getAll()
     */
    @Override
    protected Collection<PolicyTypeVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<PolicyTypeVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.PolicyTypeService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.PolicyTypeService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#save(PolicyTypeVO)
     */
    @Override
    protected PolicyTypeVO handleSave(PolicyTypeVO type)
        throws Exception
    {
        // TODO implement protected  PolicyTypeVO handleSave(PolicyTypeVO type)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.PolicyTypeService.handleSave(PolicyTypeVO type) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<PolicyTypeVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<PolicyTypeVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.PolicyTypeService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

}