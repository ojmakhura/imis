// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.imis.policy.type.benefits;

import bw.co.roguesystems.imis.policy.type.PolicyTypeRepository;
import org.springframework.stereotype.Repository;

/**
 * @see Benefit
 */
@Repository("benefitDao")
public class BenefitDaoImpl
    extends BenefitDaoBase
{
    
    public BenefitDaoImpl(
        PolicyTypeRepository policyTypeRepository,
        BenefitRepository benefitRepository
    ) {

        super(
            policyTypeRepository,
            benefitRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toBenefitVO(
        Benefit source,
        BenefitVO target)
    {
        // TODO verify behavior of toBenefitVO
        super.toBenefitVO(source, target);
        // WARNING! No conversion for target.policyType (can't convert source.getPolicyType():bw.co.roguesystems.imis.policy.type.PolicyType to bw.co.roguesystems.imis.policy.type.PolicyTypeVO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BenefitVO toBenefitVO(final Benefit entity)
    {
        // TODO verify behavior of toBenefitVO
        return super.toBenefitVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Benefit loadBenefitFromBenefitVO(BenefitVO benefitVO)
    {
        // TODO implement loadBenefitFromBenefitVO
        throw new UnsupportedOperationException("bw.co.roguesystems.imis.policy.type.benefits.loadBenefitFromBenefitVO(BenefitVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (benefitVO.getId() == null)
        {
            return  Benefit.Factory.newInstance();
        }
        else
        {
            return this.load(benefitVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public Benefit benefitVOToEntity(BenefitVO benefitVO)
    {
        // TODO verify behavior of benefitVOToEntity
        Benefit entity = this.loadBenefitFromBenefitVO(benefitVO);
        this.benefitVOToEntity(benefitVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void benefitVOToEntity(
        BenefitVO source,
        Benefit target,
        boolean copyIfNull)
    {
        // TODO verify behavior of benefitVOToEntity
        super.benefitVOToEntity(source, target, copyIfNull);
    }
}