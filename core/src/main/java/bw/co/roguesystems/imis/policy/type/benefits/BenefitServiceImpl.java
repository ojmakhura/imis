// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::policy::type::benefits::BenefitService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.policy.type.benefits;

import bw.co.roguesystems.imis.PropertySearchOrder;
import bw.co.roguesystems.imis.SortOrderFactory;

import java.util.Collection;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.query.sqm.SortOrder;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService
 */
@Service("benefitService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class BenefitServiceImpl
    extends BenefitServiceBase
{
    public BenefitServiceImpl(
        BenefitDao benefitDao,
        BenefitRepository benefitRepository,
        MessageSource messageSource
    ) {
        
        super(
            benefitDao,
            benefitRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#findById(Long)
     */
    @Override
    protected BenefitVO handleFindById(Long id)
        throws Exception
    {

        return (BenefitVO) benefitDao.load(BenefitDaoBase.TRANSFORM_BENEFITVO, id);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#getAll()
     */
    @Override
    protected Collection<BenefitVO> handleGetAll()
        throws Exception
    {

        Collection<Benefit> entities = benefitRepository.findAll();

        return benefitDao.toBenefitVOCollection(entities);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        benefitRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#save(BenefitVO)
     */
    @Override
    protected BenefitVO handleSave(BenefitVO benefit)
        throws Exception
    {

        Benefit entity = benefitDao.benefitVOToEntity(benefit);
        entity = benefitRepository.save(entity);

        return benefitDao.toBenefitVO(entity);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<BenefitVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {

        Sort sort = SortOrderFactory.createSortOrder(orderings);

        Specification<Benefit> spec = StringUtils.isBlank(criteria) ?
                null :
                (root, query, cb) -> {

                    return cb.or(
                        cb.like(cb.lower(root.get("benefit")), "%" + criteria.toLowerCase() + "%"),
                        cb.like(cb.lower(root.get("description")), "%" + criteria.toLowerCase() + "%")
                    );
                };

        Collection<Benefit> entities = sort == null ?
                benefitRepository.findAll(spec) :
                benefitRepository.findAll(spec, sort);

        return benefitDao.toBenefitVOCollection(entities);
    }

}