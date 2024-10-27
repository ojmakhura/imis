// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::policy::PolicyService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.policy;

import bw.co.roguesystems.imis.ImisSpecifications;
import bw.co.roguesystems.imis.PropertySearchOrder;
import bw.co.roguesystems.imis.SortOrderFactory;

import java.util.Collection;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
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

        return policyDao.toPolicyVO(policyRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#getAll()
     */
    @Override
    protected Collection<PolicyVO> handleGetAll()
        throws Exception
    {
        Collection<Policy> entities = policyRepository.findAll();

        return policyDao.toPolicyVOCollection(entities);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        policyRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#save(PolicyVO)
     */
    @Override
    protected PolicyVO handleSave(PolicyVO policy)
        throws Exception
    {

        Policy entity = policyDao.policyVOToEntity(policy);
        entity = policyRepository.save(entity);

        return policyDao.toPolicyVO(entity);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.PolicyService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<PolicyVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {

        Sort sort = SortOrderFactory.createSortOrder(orderings);

        Specification<Policy> spec = null;

        if(StringUtils.isNotBlank(criteria)) {

            spec = ImisSpecifications.<Policy>findByAttributeContainingIgnoreCase(criteria, "customer", "firstName")
                    .or(ImisSpecifications.findByAttributeContainingIgnoreCase(criteria, "customer", "surname"))
                    .or(ImisSpecifications.findByAttributeContainingIgnoreCase(criteria, "customer", "identityNo"))
                    .or(ImisSpecifications.findByAttributeContainingIgnoreCase(criteria, "policyType", "type"));

        }

        Collection<Policy> entities = sort == null ? 
            policyRepository.findAll(spec) :
            policyRepository.findAll(spec, sort);

        
        return policyDao.toPolicyVOCollection(entities);
    }

}