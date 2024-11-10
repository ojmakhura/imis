// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.imis.policy.beneficiary;

import bw.co.roguesystems.imis.policy.PolicyRepository;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

/**
 * @see Beneficiary
 */
@Repository("beneficiaryDao")
public class BeneficiaryDaoImpl
    extends BeneficiaryDaoBase
{
    
    public BeneficiaryDaoImpl(
        PolicyRepository policyRepository,
        BeneficiaryRepository beneficiaryRepository
    ) {

        super(
            policyRepository,
            beneficiaryRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toBeneficiaryVO(
        Beneficiary source,
        BeneficiaryVO target)
    {
        // TODO verify behavior of toBeneficiaryVO
        super.toBeneficiaryVO(source, target);
        // WARNING! No conversion for target.policies (can't convert source.getPolicies():bw.co.roguesystems.imis.policy.Policy to bw.co.roguesystems.imis.policy.PolicyVO
        if(CollectionUtils.isNotEmpty(source.getPolicies())) {
            
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BeneficiaryVO toBeneficiaryVO(final Beneficiary entity)
    {
        // TODO verify behavior of toBeneficiaryVO
        return super.toBeneficiaryVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Beneficiary loadBeneficiaryFromBeneficiaryVO(BeneficiaryVO beneficiaryVO)
    {
        if (beneficiaryVO.getId() == null)
        {
            return  Beneficiary.Factory.newInstance();
        }
        else
        {
            return this.load(beneficiaryVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public Beneficiary beneficiaryVOToEntity(BeneficiaryVO beneficiaryVO)
    {
        // TODO verify behavior of beneficiaryVOToEntity
        Beneficiary entity = this.loadBeneficiaryFromBeneficiaryVO(beneficiaryVO);
        this.beneficiaryVOToEntity(beneficiaryVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void beneficiaryVOToEntity(
        BeneficiaryVO source,
        Beneficiary target,
        boolean copyIfNull)
    {
        // TODO verify behavior of beneficiaryVOToEntity
        super.beneficiaryVOToEntity(source, target, copyIfNull);
    }
}