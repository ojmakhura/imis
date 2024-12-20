// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.imis.policy.type;

import bw.co.roguesystems.imis.policy.PolicyRepository;
import bw.co.roguesystems.imis.policy.type.benefits.BenefitRepository;
import org.springframework.stereotype.Repository;

/**
 * @see PolicyType
 */
@Repository("policyTypeDao")
public class PolicyTypeDaoImpl
    extends PolicyTypeDaoBase
{
    
    public PolicyTypeDaoImpl(
        BenefitRepository benefitRepository,
        PolicyRepository policyRepository,
        PolicyTypeRepository policyTypeRepository
    ) {

        super(
            benefitRepository,
            policyRepository,
            policyTypeRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toPolicyTypeVO(
        PolicyType source,
        PolicyTypeVO target)
    {
        // TODO verify behavior of toPolicyTypeVO
        super.toPolicyTypeVO(source, target);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyTypeVO toPolicyTypeVO(final PolicyType entity)
    {
        // TODO verify behavior of toPolicyTypeVO
        return super.toPolicyTypeVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private PolicyType loadPolicyTypeFromPolicyTypeVO(PolicyTypeVO policyTypeVO)
    {
        if (policyTypeVO.getId() == null)
        {
            return  PolicyType.Factory.newInstance();
        }
        else
        {
            return this.load(policyTypeVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public PolicyType policyTypeVOToEntity(PolicyTypeVO policyTypeVO)
    {
        // TODO verify behavior of policyTypeVOToEntity
        PolicyType entity = this.loadPolicyTypeFromPolicyTypeVO(policyTypeVO);
        this.policyTypeVOToEntity(policyTypeVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void policyTypeVOToEntity(
        PolicyTypeVO source,
        PolicyType target,
        boolean copyIfNull)
    {
        // TODO verify behavior of policyTypeVOToEntity
        super.policyTypeVOToEntity(source, target, copyIfNull);
    }
}