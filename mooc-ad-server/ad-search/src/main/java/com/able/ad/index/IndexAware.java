package com.able.ad.index;

/**
 * Created by Qinyi.
 */
public interface IndexAware<K, V> {
    /***获取key对应的value
    * @author jipeng
    * @date 2019/9/15 15:19
    * @return V
    **/
    
    V get(K key);
    /***添加kv
    * @author jipeng
    * @date 2019/9/15 15:19
    * @return void
    **/
    
    void add(K key, V value);
    /***更新k v
    * @author jipeng
    * @date 2019/9/15 15:20
    * @return void
    **/

    void update(K key, V value);
    /***删除key v
    * @author jipeng
    * @date 2019/9/15 15:20
    * @return void
    **/

    void delete(K key, V value);
}
