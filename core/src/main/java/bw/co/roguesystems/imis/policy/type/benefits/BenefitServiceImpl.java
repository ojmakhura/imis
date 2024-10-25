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
import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
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
        // TODO implement protected  BenefitVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.benefits.BenefitService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#getAll()
     */
    @Override
    protected Collection<BenefitVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<BenefitVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.benefits.BenefitService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.benefits.BenefitService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#save(BenefitVO)
     */
    @Override
    protected BenefitVO handleSave(BenefitVO benefit)
        throws Exception
    {
        // TODO implement protected  BenefitVO handleSave(BenefitVO benefit)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.benefits.BenefitService.handleSave(BenefitVO benefit) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.imis.policy.type.benefits.BenefitService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<BenefitVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {
        // TODO implement protected  Collection<BenefitVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.benefits.BenefitService.handleSearch(String criteria, Set<PropertySearchOrder> orderings) Not implemented!");
    }

}