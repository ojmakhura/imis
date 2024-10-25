// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::policy::PolicyService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.policy;

import bw.co.roguesystems.imis.PropertySearchOrder;
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.policy.PolicyService
 */
@Service("policyService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class PolicyServiceImpl
    extends PolicyServiceBase
{
    public PolicyServiceImpl(
        PolicyDao policyDao,
        PolicyRepository policyRepository,
        MessageSource messageSource
    ) {
        
        super(
            policyDao,
            policyRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#findById(Long)
     */
    @Override
    protected PolicyVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  PolicyVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.PolicyService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#getAll()
     */
    @Override
    protected Collection<PolicyVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<PolicyVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.PolicyService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.PolicyService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#save(PolicyVO)
     */
    @Override
    protected PolicyVO handleSave(PolicyVO type)
        throws Exception
    {
        // TODO implement protected  PolicyVO handleSave(PolicyVO type)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.PolicyService.handleSave(PolicyVO type) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<PolicyVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<PolicyVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.PolicyService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

}