// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.imis::policy::beneficiary::BeneficiaryService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.imis.policy.beneficiary;

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
 * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService
 */
@Service("beneficiaryService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class BeneficiaryServiceImpl
    extends BeneficiaryServiceBase
{
    public BeneficiaryServiceImpl(
        BeneficiaryDao beneficiaryDao,
        BeneficiaryRepository beneficiaryRepository,
        MessageSource messageSource
    ) {
        
        super(
            beneficiaryDao,
            beneficiaryRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#findById(Long)
     */
    @Override
    protected BeneficiaryVO handleFindById(Long id)
        throws Exception
    {

        return beneficiaryDao.toBeneficiaryVO(beneficiaryRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#getAll()
     */
    @Override
    protected Collection<BeneficiaryVO> handleGetAll()
        throws Exception
    {

        Collection<Beneficiary> entities = beneficiaryRepository.findAll();

        return beneficiaryDao.toBeneficiaryVOCollection(entities);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        beneficiaryRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#save(BeneficiaryVO)
     */
    @Override
    protected BeneficiaryVO handleSave(BeneficiaryVO benefit)
        throws Exception
    {

        Beneficiary ben = beneficiaryDao.beneficiaryVOToEntity(benefit);
        ben = beneficiaryRepository.save(ben);

        return beneficiaryDao.toBeneficiaryVO(ben);
    }

    /**
     * @see bw.co.roguesystems.imis.policy.beneficiary.BeneficiaryService#search(String, Set<PropertySearchOrder>)
     */
    @Override
    protected Collection<BeneficiaryVO> handleSearch(String criteria, Set<PropertySearchOrder> orderings)
        throws Exception
    {

        Sort sort = SortOrderFactory.createSortOrder(orderings);

        Specification<Beneficiary> spec = null;

        if(StringUtils.isNotBlank(criteria)) {

            spec = ImisSpecifications.<Beneficiary>findByAttributeContainingIgnoreCase(criteria, "firstName")
                    .or(ImisSpecifications.findByAttributeContainingIgnoreCase(criteria, "surname"))
                    .or(ImisSpecifications.findByAttributeContainingIgnoreCase(criteria, "identityNo"));

        }

        Collection<Beneficiary> entities = sort == null ?
                beneficiaryRepository.findAll(spec) :
                beneficiaryRepository.findAll(spec, sort);

        return beneficiaryDao.toBeneficiaryVOCollection(entities);
    }

}