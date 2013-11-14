package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFConditionRule;
import com.arcusys.learn.persistence.liferay.model.LFConditionRuleModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
* The base model implementation for the LFConditionRule service. Represents a row in the &quot;Learn_LFConditionRule&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFConditionRuleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFConditionRuleImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFConditionRuleImpl
* @see com.arcusys.learn.persistence.liferay.model.LFConditionRule
* @see com.arcusys.learn.persistence.liferay.model.LFConditionRuleModel
* @generated
*/
public class LFConditionRuleModelImpl extends BaseModelImpl<LFConditionRule>
    implements LFConditionRuleModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f condition rule model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFConditionRule} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFConditionRule";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "sequencingID", Types.INTEGER },
            { "combination", Types.CLOB },
            { "ruleType", Types.CLOB },
            { "action", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFConditionRule (id_ LONG not null primary key,sequencingID INTEGER null,combination TEXT null,ruleType TEXT null,action TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFConditionRule";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFConditionRule"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFConditionRule"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFConditionRule"),
            true);
    public static long RULETYPE_COLUMN_BITMASK = 1L;
    public static long SEQUENCINGID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFConditionRule"));
    private static ClassLoader _classLoader = LFConditionRule.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFConditionRule.class
        };
    private long _id;
    private Integer _sequencingID;
    private Integer _originalSequencingID;
    private boolean _setOriginalSequencingID;
    private String _combination;
    private String _ruleType;
    private String _originalRuleType;
    private String _action;
    private long _columnBitmask;
    private LFConditionRule _escapedModelProxy;

    public LFConditionRuleModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFConditionRule.class;
    }

    public String getModelClassName() {
        return LFConditionRule.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("sequencingID", getSequencingID());
        attributes.put("combination", getCombination());
        attributes.put("ruleType", getRuleType());
        attributes.put("action", getAction());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer sequencingID = (Integer) attributes.get("sequencingID");

        if (sequencingID != null) {
            setSequencingID(sequencingID);
        }

        String combination = (String) attributes.get("combination");

        if (combination != null) {
            setCombination(combination);
        }

        String ruleType = (String) attributes.get("ruleType");

        if (ruleType != null) {
            setRuleType(ruleType);
        }

        String action = (String) attributes.get("action");

        if (action != null) {
            setAction(action);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public Integer getSequencingID() {
        return _sequencingID;
    }

    public void setSequencingID(Integer sequencingID) {
        _columnBitmask |= SEQUENCINGID_COLUMN_BITMASK;

        if (!_setOriginalSequencingID) {
            _setOriginalSequencingID = true;

            _originalSequencingID = _sequencingID;
        }

        _sequencingID = sequencingID;
    }

    public Integer getOriginalSequencingID() {
        return _originalSequencingID;
    }

    public String getCombination() {
        if (_combination == null) {
            return StringPool.BLANK;
        } else {
            return _combination;
        }
    }

    public void setCombination(String combination) {
        _combination = combination;
    }

    public String getRuleType() {
        if (_ruleType == null) {
            return StringPool.BLANK;
        } else {
            return _ruleType;
        }
    }

    public void setRuleType(String ruleType) {
        _columnBitmask |= RULETYPE_COLUMN_BITMASK;

        if (_originalRuleType == null) {
            _originalRuleType = _ruleType;
        }

        _ruleType = ruleType;
    }

    public String getOriginalRuleType() {
        return GetterUtil.getString(_originalRuleType);
    }

    public String getAction() {
        if (_action == null) {
            return StringPool.BLANK;
        } else {
            return _action;
        }
    }

    public void setAction(String action) {
        _action = action;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFConditionRule.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFConditionRule toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFConditionRule) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFConditionRuleImpl lfConditionRuleImpl = new LFConditionRuleImpl();

        lfConditionRuleImpl.setId(getId());
        lfConditionRuleImpl.setSequencingID(getSequencingID());
        lfConditionRuleImpl.setCombination(getCombination());
        lfConditionRuleImpl.setRuleType(getRuleType());
        lfConditionRuleImpl.setAction(getAction());

        lfConditionRuleImpl.resetOriginalValues();

        return lfConditionRuleImpl;
    }

    public int compareTo(LFConditionRule lfConditionRule) {
        long primaryKey = lfConditionRule.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LFConditionRule lfConditionRule = null;

        try {
            lfConditionRule = (LFConditionRule) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfConditionRule.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFConditionRuleModelImpl lfConditionRuleModelImpl = this;

        lfConditionRuleModelImpl._originalSequencingID = lfConditionRuleModelImpl._sequencingID;

        lfConditionRuleModelImpl._setOriginalSequencingID = false;

        lfConditionRuleModelImpl._originalRuleType = lfConditionRuleModelImpl._ruleType;

        lfConditionRuleModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFConditionRule> toCacheModel() {
        LFConditionRuleCacheModel lfConditionRuleCacheModel = new LFConditionRuleCacheModel();

        lfConditionRuleCacheModel.id = getId();

        lfConditionRuleCacheModel.sequencingID = getSequencingID();

        lfConditionRuleCacheModel.combination = getCombination();

        String combination = lfConditionRuleCacheModel.combination;

        if ((combination != null) && (combination.length() == 0)) {
            lfConditionRuleCacheModel.combination = null;
        }

        lfConditionRuleCacheModel.ruleType = getRuleType();

        String ruleType = lfConditionRuleCacheModel.ruleType;

        if ((ruleType != null) && (ruleType.length() == 0)) {
            lfConditionRuleCacheModel.ruleType = null;
        }

        lfConditionRuleCacheModel.action = getAction();

        String action = lfConditionRuleCacheModel.action;

        if ((action != null) && (action.length() == 0)) {
            lfConditionRuleCacheModel.action = null;
        }

        return lfConditionRuleCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", sequencingID=");
        sb.append(getSequencingID());
        sb.append(", combination=");
        sb.append(getCombination());
        sb.append(", ruleType=");
        sb.append(getRuleType());
        sb.append(", action=");
        sb.append(getAction());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFConditionRule");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sequencingID</column-name><column-value><![CDATA[");
        sb.append(getSequencingID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>combination</column-name><column-value><![CDATA[");
        sb.append(getCombination());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ruleType</column-name><column-value><![CDATA[");
        sb.append(getRuleType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>action</column-name><column-value><![CDATA[");
        sb.append(getAction());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
