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

        PolicyType type = policyTypeRepository.findById(id).orElse(null);

        if(type == null ) {
            return null;
        }

        return policyTypeDao.toPolicyTypeVO(type);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#getAll()
     */
    @Override
    protected Collection<PolicyTypeVO> handleGetAll()
        throws Exception
    {

        Collection<PolicyType> types = policyTypeRepository.findAll();

        return policyTypeDao.toPolicyTypeVOCollection(types);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        policyTypeRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#save(PolicyTypeVO)
     */
    @Override
    protected PolicyTypeVO handleSave(PolicyTypeVO type)
        throws Exception
    {

        PolicyType entity = policyTypeDao.policyTypeVOToEntity(type);

        entity = policyTypeRepository.save(entity);

        return policyTypeDao.toPolicyTypeVO(entity);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.PolicyTypeService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<PolicyTypeVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {

        Sort sort = SortOrderFactory.createSortOrder(orderings);

        Specification<PolicyType> spec = 
            StringUtils.isBlank(criteria) ?
                null :
                (root, query, cb) -> {

                    return cb.like(cb.lower(root.get("type")), "%" + criteria.toLowerCase() + "%");
                };

        Collection<PolicyType> types = sort == null ?
                policyTypeRepository.findAll(spec) :
                policyTypeRepository.findAll(spec, sort);

        return policyTypeDao.toPolicyTypeVOCollection(types);
    }

}